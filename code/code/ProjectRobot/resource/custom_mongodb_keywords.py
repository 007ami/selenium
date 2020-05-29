import json
from bson.json_util import dumps

class MongoDBLibraryKeywords(object):

        def get_field_value(self, booking_id, field_name):
                query = {}
                projection = {}
                query = {'_id':booking_id}
                projection = {field_name:1}
                return self._retrieve_record(query, projection)

        def get_booking_record(self, booking_id):
                query = {}
                projection = {}
                query = {'_id':booking_id}
                return self._retrieve_record(query, projection)

        def get_booking_segment(self, booking_id, segment_type, index):
                query = {}
                projection = {}
                array_slice = {}
                query['_id'] = booking_id
                array_slice['$slice'] = [int(index), 1]
                projection['segments'] = 1
                projection['segments.' + segment_type] = array_slice
                projection['_id'] = 0
                return self._retrieve_record(query, projection)
        
        def _retrieve_record(self, query, projection):
                try:
                        db = self._dbconnection['cbr']
                except TypeError:
                        self._builtin.fail("Connection failed, please make sure you have run 'Connect To Mongodb' first.")
                if projection == {}:
                        results = dumps(db.bookings.find(query))
                else:
                        results = dumps(db.bookings.find(query, projection))
                results_json = json.loads(results)
                return results_json

        def establish_connection_to_mongodb(self, dbHost='localhost', dbPort=27017, dbUsername=None, dbPassword=None):
                
                dbapiModuleName = 'pymongo'
                db_api_2 = __import__(dbapiModuleName)

                arrdbPort = dbPort.split(',')
                maxSevSelDelay = 1

                for intPort in arrdbPort:
                    dbPort = int(intPort)
                    connection_string = 'mongodb://' + dbUsername + ':' + dbPassword + '@' + dbHost + ':' + intPort + '/cbr?authMechanism=SCRAM-SHA-1'
                    print(connection_string)
                    try:
                        self._dbconnection = db_api_2.MongoClient(connection_string, serverSelectionTimeoutMS=maxSevSelDelay)
                        self._dbconnection.server_info()
                        break
                    except db_api_2.errors.ServerSelectionTimeoutError as err:
                        print(err)

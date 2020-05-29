import redis
from rediscluster import StrictRedisCluster
import rediscluster
from robot.api import logger

def set_to_redis_hash(redis_conn, hashname, mapping):
        """ Set To Redis Hash
        Arguments:
            - redis_conn: Redis connection object
            - hashname: redis hashname.
            - mapping: String data (space delimited)
        Examples:
        | ${data}=   | Set To Redis Hash |  ${redis_conn} | ${hash_name} | ${mapping}  |
        """
        return redis_conn.hmset(hashname, mapping)

def connect_to_redis_cluster(redis_host, redis_port): # pragma: no cover
        """Connect To Redis Cluster.
        Arguments:
            - redis_host: hostname or IP address of the Redis server.
            - redis_port: Redis port number (default=6379)
        Return redis connection object
        Examples:
        | ${redis_conn}=   | Connect To Redis Cluster |  redis-dev.com | 6379 |
        """
        startup_nodes = [{"host":redis_host, "port":redis_port}]
        try:
            redis_conn = redis.StrictRedisCluster(startup_nodes=startup_nodes, decode_responses=True, skip_full_coverage_check=True)
        except Exception as ex:
            logger.error(str(ex))
            raise Exception(str(ex))
        return redis_conn

def set_to_redis_agent_index(redis_conn, indexname, hashname):
        """ Set To Redis Agent Index
        Arguments:
            - redis_conn: Redis connection object
            - hashname: redis hashname.
        Examples:
        | ${data}=   | Set To Redis Agent Index |  ${redis_conn} | ${hash_name} |
        """
        #index = "INDEX::AGENT"
        return redis_conn.zadd(indexname, 0, hashname)

def set_to_redis_client_index(redis_conn, indexname, hashname):
        """ Set To Redis Client Index
        Arguments:
            - redis_conn: Redis connection object
            - client_id: csu_guid
            - hashname: redis hashname.
        Examples:
        | ${data}=   | Set To Redis Client Index |  ${redis_conn} | ${client_id} | ${hash_name}
        """
        #index = "INDEX::CLIENT::" + client_id
        return redis_conn.zadd(indexname, 0, hashname)

def delete_from_agent_index(redis_conn, hashname):
        """ Delete From Agent Index
        Arguments:
            - redis_conn: Redis connection object
            - hashname: redis hashname.
        Examples:
        | ${data}=   | Delete From Agent Index |  ${redis_conn} | ${hash_name}
        """
        index = "INDEX::AGENT"
        return redis_conn.zrem(index, hashname)

def set_to_redis_boost_index(redis_conn, index, hashname):
        """ Set To Redis Boost Index
        Arguments:
            - redis_conn: Redis connection object
            - client_id: csu_guid
            - hashname: redis hashname.
        Examples:
        | ${data}=   | Set To Redis Boost Index |  ${redis_conn} | ${client_id} | ${hash_name}
        """
        #index = "INDEX::BOOST::" + client_id
        return redis_conn.zadd(index, 0, hashname)

def set_to_redis_travelport_index(redis_conn, citycode, values):
        """ Set To Redis TravelPort Index
        Arguments:
            - redis_conn: Redis connection object
            - citycode: redis hashname.
            - values: Value1, Value2, Value3
        Examples:
        | ${data}=   | Set To Redis TravelPort Index |  ${redis_conn} | ${citycode} | ${values}
        """
        index = "INDEX::TVLPORT::" + citycode
        values = values.split(",")   
        return redis_conn.sadd(index, *set(values))

def set_to_redis_sadd(redis_conn, hashname, value):
        """ Set To Redis SAdd
        Arguments:
            - redis_conn: Redis connection object
            - hashname: redis hashname.
            - value: {"version":"v0","lastUpdated":"2018-08-17 09:20:22"}
        Examples:
        | ${data}=   | Set To Redis SAdd |  ${redis_conn} | ${hashname} | ${value}
        """ 
        return redis_conn.sadd(hashname, value)

def get_all_index_values(redis_conn, key):
        "Return a Python list of the index names"
        return redis_conn.zrange(key, 0, -1)

def get_all_set_members(redis_conn, key):
        "Return a Python list of the members of set"
        return redis_conn.smembers(key)

def get_all_keys(redis_conn):
        "Return a Python list of the keys"
        return redis_conn.keys('*')

def get_all_list_values(redis_conn, key):
        "Return a Python list of the index names"
        return redis_conn.lrange(key, 0, -1)

def get_all_keys_using_pattern(redis_conn, pattern):
        "Return a Python list of the keys"
        return redis_conn.keys(pattern)

def set_to_redis_rpush(redis_conn, hashname, value):
        """ Set To Redis rpush
        Arguments:
            - redis_conn: Redis connection object
            - hashname: redis hashname.
            - value: {"version":"v0","lastUpdated":"2018-08-17 09:20:22"}
        Examples:
        | ${data}=   | Set To Redis SAdd |  ${redis_conn} | ${hashname} | ${value}
        """ 
        return redis_conn.rpush(hashname, value)

def set_to_redis_carriers_zset(redis_conn, zsetname, hashname):
        """ Set To Redis Carriers Zset
        Arguments:
            - redis_conn: Redis connection object
            - zsetname: zsetname
            - hashname: redis hashname.
        Examples:
        | ${data}=   | Set To Redis Client Index |  ${redis_conn} | ${client_id} | ${hash_name}
        """
        return redis_conn.zadd(zsetname, 0, hashname)
		
def set_to_redis_traveler_index(redis_conn, index, hashname):
        """ Set To Redis Boost Index
        Arguments:
            - redis_conn: Redis connection object
            - client_id: csu_guid
            - hashname: redis hashname.
        Examples:
        | ${data}=   | Set To Redis Boost Index |  ${redis_conn} | ${client_id} | ${hash_name}
        """
        #index = "INDEX::BOOST::" + client_id
        return redis_conn.zadd(index, 0, hashname)
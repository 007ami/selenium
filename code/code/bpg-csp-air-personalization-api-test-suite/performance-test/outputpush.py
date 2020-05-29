import boto3
import sys
print 'Argument List:', str(sys.argv)
s3 = boto3.resource('s3')
data = open(sys.argv[2], 'rb')
s3.Bucket(sys.argv[1]).put_object(Key=sys.argv[3], Body=data)
import csv
import re
# import pandas

def check_csv_for_null(filename):
	with open(filename, 'r') as f:
		data = csv.reader(f)
		for row in data:
			if(len(row)>0):
				return "CSV is not Null"

def check_csv_for_duplicates(filename):
	with open(filename,'r') as f:
		data = csv.reader(f)
		for row in data:
			for item in row:
				if row.count(item) > 1:
					print("There are duplicates in this row",row)
					break;

if _name_ == '_main_':
	# print	check_csv_for_null("data1.csv")
	# check_csv_for_duplicates("data1.csv")
import csv
import re
# import pandas

def readcsv(filename, mode):
	with open(filename,mode) as f:
		data = csv.reader(f)
		for row in data:
			print(row)
			if 'Java' in row:
				print row.index('Java')
		
def readcsvasdict(filename):
	print("CSV as Dict")
	reader = csv.DictReader(open(filename))
	for raw in reader:
		print raw

def writecsv(filename,mode):
	with open(filename, mode) as f:
		writer = csv.writer(f, delimiter=',', quotechar='"',quoting=csv.QUOTE_MINIMAL)
		writer.writerow(['Programming language', 'Designed by', 'Appeared', 'Extension'])
		writer.writerow(['Python', 'Guido van Rossum', '1991', '.py'])
		writer.writerow(['Java', 'James Gosling', '1995', '.java'])
		writer.writerow(['C++', 'Bjarne Stroustrup', '1985', '.cpp'])

def readcsvwithpanda(filename):
	result = pandas.read_csv(filename)
	print result

if __name__ == '__main__':
	# writecsv('text.csv','w')
	readcsv('text.csv','r')
	# readcsvwithpanda('text.csv')
import psycopg2
import faker
import random
import string
from faker import Faker
#psycopg2 package ehlps connect python to postgresql
#faker is a package that generates random names


#holds data
data=[]

#making the faker gen
fake=Faker()

#generates a data a random size that includes first name, last name, and an id
def genData():
    alphanum=string.ascii_letters+string.digits
    randdatasize=random.randint(1,10)
    for i in range(randdatasize):
        fname=fake.first_name()
        lname=fake.last_name()
        randID="".join(random.choices(alphanum, k=6))
        datestarted= fake.date_this_decade()
        ptoused=random.randint(0,24)
        data.append ((fname,lname,randID,datestarted,ptoused))
    return (data)

#enter database information
connec= psycopg2.connect(
    dbname="dbname",
    user="username",
    password="password",
    host="localhost",
    port="5432"
)

#labemployees is the schema and Im directing to it to get to labmanger
sqlComm="insert into labemployees.labmanager (fname, lname, researcherid, datestarted, ptoused) values (%s, %s, %s, %s, %s)"
labmanagerdata=genData()
pointer=connec.cursor()
pointer.executemany(sqlComm, labmanagerdata)
#save inserted data
connec.commit()
print(f"inserted {pointer.rowcount} rows")
print("Data inserted!")
pointer.close()
connec.close()
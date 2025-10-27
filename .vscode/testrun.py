marks1 = 12.5
marks2 = 12.7
marks = [12.5, 12.7]
print(marks)
print(type(marks))
print(marks[0])
print(marks[1])
print(len(marks))
student = ["Karan", 85, "Cali"]
str = "Hello"
print(str[0])
#bcz str is immutable str[0] = "y"
#bcz list is mutable
student[0] = "arjun"
print(student)
#[0, 1, 2...]
marks = [23, 322, 43, 548]
print(marks[1:4])
print(marks[:4])
print(marks[1:])
print(marks[-3:-1])
#list = [2, 1, 3]
#list1 = ['a', 'b', 'h', 'm', 'o', 'e']
#list.append(4)
#print(list.sort())
#print(list)
#print(list1.sort(reverse=True))
#print(list1)
#list1.reverse()
#print(list1)
#list2 = [1, 5, 7, 9]
#list2.insert(1, 0)
#print(list2)
#list.remove(3)
#print(list)
#list.pop(2)
#print(list)
#tuple immutable
tup = (2, 1, 3, 1)
print(type(tup))
print(tup[0])
print(tup[1])
#tup[0] = 5
tup1 = ()
print(tup1)
print(type(tup1))
tup2 = (1, )
print(tup2)
print(type(tup2))
tup3 = (1)
print(type(tup3))
tup4 = ('Hello')
print(type(tup4))
print(tup[1:3])
print(tup.index(1))
print(tup.count(1))
#dictionary key:value - unordered,mutable,no duplication keys
info = {
    "name" : "shayan",
    "cg" : 3.09,
    "age" : [13, 12, 10],
    "is_adult" : True,
    }
print(info)
print(info["name"])
print(info["age"])
info["name"] = 23 #overwrite
print(info["name"])
info["surname"] = "ashraf"
print(info)
null_dict = {}
null_dict["name"] = "joynul"
print(null_dict)
student = {
    "name" : "shayan ashraf",
    "subjects" : {
        "phy" : 95,
        "chem" : 93,
        "math" : 99
    }
}
print(student)
print(student["subjects"]["chem"])
print(student.keys())
print(len(list(student.keys())))#returns all keys
print(list(student.values()))#returns all values
print(list(student.items()))#returns all pairs as tuples
pairs = list(student.keys())
print(pairs[0])
#print(student["name2"]) - Error
print(student.get("name2"))#returns key according to values
new_dict = {"name" : "neha kumar", "age" : 16, "city" : "Dhaka"}
student.update(new_dict)
print(student)
collection = {1, 2, 2, 2, "hello", "world", "world", 4}
print(collection)
print(len(collection))
print(type(collection))
collection1 = {} #empty dict
print(type(collection1))
collection2 = set()
print(type(collection2))
collection2.add(1)
collection2.add(2)
collection2.add(2)
#collection.remove(7) - bcz it doesnt exist
collection2.add("apnacollege")
collection2.add("apnacollege")
collection2.add((1, 2, 3))#tuple
#collection2.add([1, 2, 3]) - list
print(collection2)
print(len(collection2))
collection2.clear()
print(collection2)
print(len(collection2))
collection3 = {"hello", "world", "lol", "jk"}
print(collection3.pop())
print(collection3.pop())
set1 = {1, 2, 3}
set2 = {2, 3, 4}
print(set1.intersection(set2))
print(set2.union(set1))
print(set1)
#movies = []
#movies.append(input("enter 1st movie: "))
#movies.append(input("enter 2nd movie: "))
#movies.append(input("enter 3rd movie: "))

#print(movies)


list1 = ["m", "a", "a", "m", "p"]
copy_list1 = list1.copy()
copy_list1.reverse()
if(copy_list1 == list1):
    print("palindrome.")
else:
    print("not palindrome.")
class Person:
    def __init__(self, firstName, lastName, idNumber):
        self.firstName = firstName
        self.lastName = lastName
        self.idNumber = idNumber
        def printPerson(self):
            print("Name:", self.lastName + ",", self.firstName)
            print("ID:", self.idNumber)


class Student(Person):
    def __init__(self,firstName, lastName, idNumber,scores):
        Person.__init__(self,firstName, lastName, idNumber)
        self.scores = scores

    def printPerson(self):
        super(Student, self).printPerson()
    
    def calculate(self):
        avg = reduce(lambda x, y: x + y, scores) / len(scores)
        if avg >= 90 and avg <= 100:
            return 'O'
        elif avg >= 80 and avg < 90:
            return 'E'
        elif avg >= 70 and avg < 80:
            return 'A'
        elif avg >= 60 and avg < 70:
            return 'P'
        elif avg >= 50 and avg < 40:
            return 'D'
        elif avg <40:
            return 'T'
        
line = input().split()
firstName = line[0]
lastName = line[1]
idNum = line[2]
numScores = int(input()) # not needed for Python
scores = input().split()
s = Student(firstName, lastName, idNum, scores)
s.printPerson()
print("Grade:", s.calculate())

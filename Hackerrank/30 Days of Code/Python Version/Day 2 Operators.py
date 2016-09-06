mealCost = float(input())
tip = int(input())
tax = int(input())

totalCost = mealCost + (float(tip)*mealCost)/float(100) + (float(tax)*mealCost)/float(100)

totalCost = int(round(totalCost))

print("The total meal cost is "+ str(totalCost) + " dollars.")

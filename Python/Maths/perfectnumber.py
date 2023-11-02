n = int(input("Enter any number: "))
sum = 0
i = 1
while i < n:
    if n % i == 0:
        sum += i
    i += 1
if (sum == n):
    print("N is a Perfect number")
else:
    print("N is not a Perfect number")
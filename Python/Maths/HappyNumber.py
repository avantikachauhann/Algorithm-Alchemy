def is_happy_number(n):
    def get_next(num):
        total_sum = 0
        while num > 0:
            num, digit = divmod(num, 10)
            total_sum += digit ** 2
        return total_sum

    seen = set()
    while n != 1 and n not in seen:
        seen.add(n)
        n = get_next(n)

    return n == 1

if __name__ == "__main__":
    n = int(input("Enter number to find Happy Number or Not: "))
    if is_happy_number(n):
        print(f"{n} is a Happy number")
    else:
        print(f"{n} is not a Happy number")

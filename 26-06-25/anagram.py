def is_anagram(str1, str2):
    return sorted(str1.replace(" ", "").lower()) == sorted(str2.replace(" ", "").lower())

s1 = input("Enter first string: ")
s2 = input("Enter second string: ")
print("Anagram" if is_anagram(s1, s2) else "Not an Anagram")

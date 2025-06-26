sentence = input("Enter a sentence: ")
words = sentence.lower().split()
frequency = {}

for word in words:
    frequency[word] = frequency.get(word, 0) + 1

print("Word frequencies:")
for word, count in frequency.items():
    print(f"{word}: {count}")

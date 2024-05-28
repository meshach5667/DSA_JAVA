# Algorithm to Check if a String is a Palindrome

## Input
- A string `str`.

## Output
- A boolean value indicating whether `str` is a palindrome.

## Steps

1. **Handle Null Input**:
   - If `str` is `null`, return `false`.

2. **Clean the String**:
   - Remove all non-alphanumeric characters from `str`.
   - Convert the resulting string to lowercase.

3. **Initialize Variables**:
   - Let `cleanedStr` be the cleaned and lowercase version of `str`.
   - Let `length` be the length of `cleanedStr`.

4. **Check for Palindrome**:
   - Loop through the first half of `cleanedStr`:
     - For each character at position `i` (where `i` ranges from `0` to `length / 2 - 1`):
       - Compare the character at position `i` with the character at position `length - 1 - i`.
       - If any pair of characters do not match, return `false`.

5. **Return True**:
   - If all pairs of characters match, return `true`.

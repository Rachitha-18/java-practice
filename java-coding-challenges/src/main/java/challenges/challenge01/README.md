# Reverse String

## Problem

Reverse a given string.

### Example

Input: `Java`
Output: `avaJ`

## Solution

Use `StringBuilder.reverse()`.

```java
String reversed = new StringBuilder(str)
        .reverse()
        .toString();
```

## Complexity

* Time: O(n)
* Space: O(n)

## Interview Note

* `StringBuilder` is mutable and efficient for string manipulation.
* Alternative approaches:

    * Loop from end to start
    * Char array
    * Recursion

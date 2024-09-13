# Unary Operators

- Unary operators use just one variable to work with. They usually change the variable's value. They are:

  - `-`: Change the signal of the value
  - `++`: Adds 1 to the value and update the value.

    - **Attention**: It matters if this operator is used before or after the name of the variable. For example:

    ```java
    int num = 2;
    System.out.println(num++ * 2);
    // 4 (first multiply by 2 and after add 1)
    System.out.println(num);
    // 3 (showing that the value was updated)

    num = 2;
    System.out.println(++num * 2);
    // 6 (first add 1 and after multiply by 2)
    System.out.println(num);
    // 3 (showing that the value was updated)
    ```

  - `--`: Subtract 1 to the value and update the value. Same observation than for `++` is important.
  - `!`: Change the boolean value of a boolean variable.

# Basic Anatomy of java

```java
public class ClassName {
  // My code
}
```

- If a class executes other components of our app, we must initialize this class with the `main` method.

```java
public static void main(String [] args) {
  // my code
}
```

# Variables

- If I want that some variable doesn't be changed, I have to include the key word `final` with the variable's name in uppercase.
- On the other way, if a variable can be changed, just initialize it with your type and a name in camelcase format.

```java
// don't change
final String FAB = "Fábio";
final double PI = 3.14;

// can change
int myAge = 36;
double radiusOfCircle = 2.65;
```

# Anatomy of Variables and Methods

## Variables

```java
// Type name = value (optionally)
int myAge = 36;
String name = "Fábio";
Cat jurema; // in this case is a class instance with name jurema
```

## Methods

```java
// ReturnType NameMethod (params)
// the name is usually at infinitive form

int toSum (int num1, int num2);
String toIncludeCep (String Address, long cep)
```

# Anatomy of Project Folder

- Splitting our project on multiple folders inside `src`, we must add the syntax `package relative.path` at begin of the app.

```java
package some.path;
/*
the sub-folders must be separate by periods,
lowercase, without symbols. Use underline to
separate words
*/

public class name {
  // code
}
```

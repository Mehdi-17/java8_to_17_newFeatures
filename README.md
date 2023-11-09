# Java 8 to Java 17 learning resource

This repository is a personal learning resource for me, covering the evolution of the Java language from version 8 to the latest Java 17. Explore new features, enhancements, and best practices, while I gain valuable insights into modern Java development.

From the readme, you can explore the evolution of the Java language from version 8 to the latest Java 17.  
Below, you'll find links to various Java features and enhancements:

## 2 New methods for List Interface and a new method on streams
Java 9 introduced two methods for the List interface : 
1) List.of() allows you to create an immutable list of elements. This method cannot contains null values.
2) In addition, List.copyOf() allows you to copy a collection of objects and return an immutable list as well. It's important to note that if you attempt to make a copy of an immutable list using List.copyOf(), it will create a reference to the same object. This method cannot contains null values.

Java 16 introduced toList() method directly on streams. This method returns a immutable list that can contain  null values.
- [Jump to demo](https://github.com/Mehdi-17/java8_to_17_newFeatures/blob/main/src/main/java/com/activit/sfeir/ListFeatures/ListFeaturesTest.java)

## New Switch syntax
 Java 12 introduced a new syntax for the switch statement, making it more concise and easier to read.
 - [Switch statement code](https://github.com/Mehdi-17/java8_to_17_newFeatures/blob/main/src/main/java/com/activit/sfeir/SwitchSyntax/SwitchSyntaxExampleTest.java)

## New Pattern Matching for the instanceof operator
Java 14 introduced a new enhancement called "Pattern Matching for the instanceof operator" which simplifies the code when working with object types.  
With the new syntax, you can create a variable within the if statement to increase readability :
- [Pattern matching code sample](https://github.com/Mehdi-17/java8_to_17_newFeatures/blob/main/src/main/java/com/activit/sfeir/Instanceof/InstanceOfUseTest.java)

## Type Inference
Java introduced type inference since Java 10. They add the 'var' word (not a key word for backward compatibility) to initialize a variable.  
Type inference doesn't work for class fields.
- [Discover type inference](https://github.com/Mehdi-17/java8_to_17_newFeatures/blob/main/src/main/java/com/activit/sfeir/TypeInference/TypeInferenceTest.java)

## Records
Record are introduce in Java to give a way to describe data. Records are a quick and concise because they automatically generates constructors, getter, equals and hash code methods.
It’s important to note that records are immutable, so you can’t change their values after the initialization. And they cannot extends any class and cannot be extended too.
Here is an example of a simple class called Player with 2 fields (approximately 65 lines), and a record of the same structure (approximately 10 lines).
- [Records showcase](https://github.com/Mehdi-17/java8_to_17_newFeatures/blob/main/src/main/java/com/activit/sfeir/Records/RecordsExampleTest.java)

## Text Block
In traditional Java code, multiline strings could be hard to write with lots of escape characters and concatenation.  
With the introduction of text blocks in Java, working with multiline strings has become significantly more straightforward and readable.
- [Text Block example](https://github.com/Mehdi-17/java8_to_17_newFeatures/blob/main/src/main/java/com/activit/sfeir/TextBlock/TextBlockTest.java)

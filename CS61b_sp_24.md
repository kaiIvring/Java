# CS61b Sp_24



## Lecture 1 - Introduction

  To run the code in `Hello.java`, we would first **compile** the code into a `.class` file using the command `javac HelloWorld.java`. Then, to run the code, we would use the command `java HelloWorld`

___

## Lecture 2 - Defining and Using Classes

Static and Non-static method:

static:针对**“全体”**，"invoke using the **class name**,e.g. Dog.makeNoise" --> Class methods

Non-static:针对**具体的对象**，"invoke using an **instance name**,e.g. maya.makeNoise" --> instance methods

___

## Lecture 3 - Lists Ⅰ References, Recursion, and Lists

Primitive types : byte, short, int, long, float, double, boolen, char

Reference types : Everything else, e.g, arrays.

Primitive类型的变量创建时存放的**就是变量具体的值**；Reference类型的变量存放的只是一个**“reference”**，类似指针，只有使用“new”关键词后,该reference才指向具体变量，即：“new”关键词创建具体变量的值后将该变量的“地址”返回并赋给了Reference变量

___

## Lecture 4 - List Ⅱ: SLLists(singly linked list)

**Access control**: public and private

public变量或方法允许用户使用和更改，private则不允许，但不起到保护作用（还是有可能“被攻击”) (用户无需在意private部分) --> 类比：public就像车的方向盘，油门... ; private就像车的发动机，内部线路之类的.

___

## Lecture 5 - List Ⅲ: DLLists and Arrays(doubly linked list)

泛型:`public class SLList <pineapple>`尖括号内为占位符，可以是任意字母，后续代码引用时将其替换为具体数据类型即可

Array也是引用类型，创建一个4x4的二维数组时实际上创建了五个“引用”，一个指向“主数组”，后四个由“主数组”的四个空间分别指向四个“子数组”
___

## Lecture 6 - Testing

## write tests before write codes

___


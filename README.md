# firstcode-simplecalculator
SimpleCalculator for Thinc First Code

This branch is an exercise for readers(?)

### Before you start coding

- Understand what the app is going to do (from java->res->layout->activity_main.xml)
- Go to java->com.example.samuraiwarm(?)->simplecalculator->MainActivity.kt
- Read the pseudo-code provided

If you finally understand what you're going to do, let's get started!

## Cheat sheet

DISCLAIMER: If you are 1st year from ISE and need to take Java courses, don't get confused with Kotlin syntax in the test! I may advertise you sooo much that Kotlin is way better than Java, but it's better to understand both syntaxes in the end. ^w^

Spoilers: You might not need to use Java in the 2nd year for advanced comp prog course (for app development), but you still need Python :v

### Kotlin Syntax

Primitive Data types: `Byte, Short, Int, Long, Double, Float, Boolean, Char, String`

Operations: Same as most languages. `+ - * / % **`, `> < >= <= == !=`, `&& ||`, `++ --`

`val yourVariable: ObjectType = yourValue`

```
val -> cannot be reassigned
var -> can be reassigned

ObjectType -> non-nullable object. yourValue cannot be null
ObjectType? -> null-safe object. yourValue can be null
[ObjectType is optional, but will help you with tracking the data types]

examples!

val gender: String = "male"
var yourAge: Int = 18
var girlfriendName: String? = null //sad reacts?
val myFavoritePhoneNumber = 191

```

String literals

You can put your variables in the String without the complicated String adding operations in Kotlin.

```
You can use ${variable} inside the String to use these variables.

Kotlin

val age: Int = 16
val name: String = "Samuraiwarm"
val yourIntro: String = "My name is ${name} and I am ${age} years old!"
//My name is Samuraiwarm and I am 16 years old!

Java

Int age = 16;
String name = "Samuraiwarm";
String yourIntro = "My name is "+name+" and I am "+age+" years old!"; //oh my dog screw this

Kotlin-1:Java-0 \(^o^)/
```

Logging

We can't use System.out.print() or print() in Kotlin, but we have a log function to display your log for debugging purpose. You can see the log message in **logcat** in Android Studio.

```
Log.i(tag,message) //info
Log.e(tag,message) //error
Log.w(tag,message) //warning
Log.wtf(tag,message) //i have no idea lol

All of them will log for you, but in different color. You can add the tag for each logs to keep track of the log.

example!
Log.i("Test","Hello Doggie") will log as
"something bla bla bla com.example.yourapp I/Test: Hello Doggie" in default terminal text color(?).

Log.e("ERROR?","ERROR!!!") will log as
"something bla bla bla com.example.yourapp E/ERROR?: ERROR!!!" in red text.

```

Functions

```
fun yourFunction(parameter: ParameterType): ReturnType{
   //do your function
   return returnTypeObject
}

Your function does not need to return anything (return void)
fun yourAnotherFunction(){
  //do the stuff
}

examples!
fun squareNumber(x: Double): Double{
  return x**2
}

more examples!
fun sayHi(){
  Log.i("","Goodbye World")
}
```

Functions and Property access of variables

`Object.function() or Object.property`

`Object!!.function() or Object!!.property` -> non-null asserted. Even if the Object is null, ignore it. Some functions/property will bug if your object is actually null.

We won't get to details on creating functions that can be called after the object yet.

```
examples!

val dog: Dog
dog.bark() //Woof!
print(dog.age)

```

if-else statement

```
if(condition){
  //do this if condition==true
} else {
  //do this if condition==false
}

if(condition){
  //do this
} else if(anotherCondition){
  //do that
} else {
  //do something else
}
```

for loop

```
for(i in startNumber..endNumber){
  //do something when i = startNumber, startNumber+1, startNumber+2, ..., endNumber
}

examples!

val sum = 0
for(i in 1..5){
  sum += sum+i
}
//now sum = 1+2+3+4+5 = 15
```

when (switch-case in java)

When you have to check the same variable so many times, Kotlin has you covered with when(condition).

```
if(variableToCheck==case1){
  //do this
} else if (variableToCheck==case2){
  //do that
} else if ... //too lazy to type ;w;

can be converted to this

when(variableToCheck){
  case1 -> what happens //if variableToCheck == case1
  case2 -> what happens //if variableToCheck == case2 and so on
  case3 -> {
    what in the world will happen
    bla bla bla
  }
  else -> what happens
}  
//unlike Java, you don't need to break every single cases.
```



### Android functions/methods in this session

```
Button.setOnClickListnener{
  //set what happens when you click the button
}
``` 

`Object.id` returns the id of any object as Int

`EditText.text.toString()` returns text from editText as String

`String.toInt() / String.toDouble() / String.toFloat() / etc.` cast from String to data types
`String.toIntOrNull() / String.toDoubleOrNull() / String.toFloatOrNull() / etc.` cast from String to data types if possible, else returns null

`RadioGroup.checkedRadioButtonId` returns the id of checked radio button in the radioGroup

`Toast.makeText(context,text,duration).show()` display a pop-up message on your app
```
context: too complex on this scope, just put `this`
text: any String
duration: either Toast.LENGTH_LONG or Toast.LENGTH_SHORT
```

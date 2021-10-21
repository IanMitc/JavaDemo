# Encapsulation

> It means hiding your method, variables with the help of access modifiers
> Packages
> Access Modifiers

# Packages
In java, a package is a group of similar type of classes, interface and sub packages
Packages in java can be categorized in two forms
1. built in package
2. user defined packages

there are many built-in packages are available in java for example lang, awt, swing, io, util, sql etc

# Advantages
1. packages are used to categorized the classes and interface so that they can be asily maintained
2. java packages provide access protection
3. java packages removes naming collision

package myPack;

class A{

}

class B{

}


import myPack.*;
import myPack.A;



# Access Modifiers in Java
there are two type of modifiers
1. access modifiers - public, private, default, protected
2. non-access modifiers - abstract, static, final

# Access modifiers
1. private
2. public
3. protected
4. default

private - the access level of a private modifier is only within the class, it cannot be accessed from outside the class
default - the access level of a default modifier is only within the package. It cannot be accessed from outside the package
          if we dont specify any access modifier, it wil be default
protected - the access level of a protected modifier is within the package and outside the package through child class
            if we do not make the child class, it cannot be access from outside the package
public - the access level of a public modifier is everywhere it can be accessed within the class, outside the class, 
         within package and outside the package











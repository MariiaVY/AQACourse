//2) Take the classes from the task 1. Create a new test class. Import everything (*) from your created packages.
// Now try to create objects of your classes without specifying the packages in front of the class names.
// What happened? How can we avoid this? - can be conflicts if class names are equal

//package com.domainname.modulename.*;
import com.domainname.modulename.Simple;
//package com.domainname.modulename1.*;

public class testClass {
    Simple t = new Simple();
}

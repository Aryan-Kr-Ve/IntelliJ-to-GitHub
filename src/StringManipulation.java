public class StringManipulation {
        public static void main(String[] args) {

            String str = "Hello Java";

            System.out.println("String: " + str);
            System.out.println("Length: " + str.length());
            System.out.println("Character at 1: " + str.charAt(1));
            System.out.println("Uppercase: " + str.toUpperCase());
            System.out.println("Lowercase: " + str.toLowerCase());
            System.out.println("Substring: " + str.substring(6));
            System.out.println("Contains Java: " + str.contains("Java"));
            System.out.println("Index of J: " + str.indexOf('J'));
            System.out.println("Replace: " + str.replace("Java", "World"));

            //Using equals()
            String a = "Java";
            String b = "Java";
            System.out.println(a.equals(b));

            //String Concatenation
            String first = "Hello";
            String second = "Java";
            String result = first + " " + second;
            result = first.concat(" ").concat(second);
            System.out.println(result);


            //Extracting a Substring
            String str01 = "Programming";
            System.out.println(str01.substring(3));
            System.out.println(str01.substring(0, 4));

            /*StringBuilder
            String is immutable, so frequent modifications can create many objects. StringBuilder is preferable
            when repeatedly changing a string.
             */

            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" Java");
            sb.insert(6, "World ");
            sb.replace(0, 5, "Hi");
            sb.delete(3, 8);
            sb.reverse();
            System.out.println(sb);

            /*Common methods:
            append()
            insert()
            replace()
            delete()
            reverse()
Definition
String manipulation in Java is the process of performing
operations such as concatenation, comparison, searching,
extraction, replacement, conversion, and modification on
strings using classes such as String, StringBuilder, and StringBuffer.
*/


        }
    }
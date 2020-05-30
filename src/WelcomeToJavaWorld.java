//3. The web is built with HTML strings like "<i>Hello</i>" which draws Hello as italic text.
//   In this example, the "i" tag makes <i> and </i> which surround the word "Hello".
//   Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Hello</i>".
//   Task: word = "Welcome to Java World", tag="p"

public class WelcomeToJavaWorld {
    public static void main(String[] args) {

        //String all = String.join("</p> ", "Welcome", "to", "Java", "World", " ");
        //StringBuffer sb = new StringBuffer(all);
       // sb.insert(0, " <p>");
       // sb.insert(16, " <p>");
       // sb.insert(27, " <p>");
       // sb.insert(40, " <p>");
       // System.out.println(sb);

        String word = "Welcome to Java World";
        String end = "</p>";
        String start = "<p>";
        String html = start + word + end;
        System.out.println(html);

        }
}

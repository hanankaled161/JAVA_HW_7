public class FillInQuestion extends Questions{
    public void setText(String text)
    {
       super.setText(text);
    }
    public void display()
    {
        int i = 0;
        while (i<text.length()) {
            if (text.charAt(i) == '_') break;
            System.out.print(text.charAt(i));
            i++;
        }
        System.out.println("____");
    }
    public String getTextWithAnswer()
    {
        return text;
    }
}



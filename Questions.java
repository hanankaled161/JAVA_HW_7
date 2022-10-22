public class Questions {
    protected String text;
    private String answer;
    public Questions()
    {
        text="";
        answer="";
    }
    public void display()
    {
        System.out.println(text);
    }
    public void setText(String text)
    {
        this.text = text;
    }
    public void setAnswer(String answer)
    {
        this.answer = answer;
    }
    public boolean check_answer(String respons)
    {
        int i=0,sumLength=0;
        String capRespons=respons.toUpperCase();
        String capAnswer=answer.toUpperCase();
        while (i<answer.length()&&capAnswer.charAt(i)==capRespons.charAt(i))
        {
            i++;
            sumLength++;
        }
        if(sumLength==answer.length())
            return true;
        else return false;
    }
    @Override
    public String toString() {
        return "Questions{" +
                "text='" + text + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}

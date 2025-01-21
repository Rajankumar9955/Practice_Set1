        {
            for(String wd:evenWords)
            {
                if(words.length()<wd.length())
                {
                    words=wd;
                }
            }
        }
        if(sentense=="")
        {
            words="00";
        }
        return words;
    }

    public static void main(String[] args)
    {
            String result=LogestEvenWords("Thish is Rajan 
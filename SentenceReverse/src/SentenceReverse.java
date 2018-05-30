public class SentenceReverse {
    public static void main(String[] args) {
//            String s = "abc.";
//        int i = s.lastIndexOf(".");
//        String substring = s.substring(i);
//        String substring1 = s.substring(0, i);
//        substring = substring+substring1;
//        System.out.println("i = " + substring);
//       // s.substring(s.)
        String s = "my name is shenchen, and I am 27 years old.";
        String s1 = sentenceReverse(s);
        System.out.println("s1 = " + s1);
		System.out.println("s1 = " + s1);
    }

    public static String sentenceReverse(String sentence){
        String[] split = sentence.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = split.length-1; i >= 0; i--) {
            //每一句话从最后一个单词开始拼接
            //拼接之前处理标点符号
            if(split[i].contains(".")){
                int j = split[i].lastIndexOf(".");
                String substring1 = split[i].substring(0, j);
                if (i==0){
                    sb.append(".").append(substring1);
                }else{
                    sb.append(".").append(substring1).append(" ");
                }

            }else if(split[i].contains(",")){
                int j = split[i].lastIndexOf(",");
                String substring2 = split[i].substring(0, j);
                if(i==0){
                    sb.append(",").append(substring2);
                }else{
                    sb.append(",").append(substring2).append(" ");
                }

            }else{
                if(i==0){
                    sb.append(split[i]);
                }else{
                    sb.append(split[i]).append(" ");
                }

            }


        }
        return sb.toString();
    }
}

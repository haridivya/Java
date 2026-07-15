class carryForwardTechnique{
    public static void main(String args[]){
        String s="gga";
        int a=0;
        int pairs=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                a+=1;
            }
            else if(s.charAt(i)=='g'){
                pairs+=a;
            }
        }
        System.out.println(pairs);
    }
}

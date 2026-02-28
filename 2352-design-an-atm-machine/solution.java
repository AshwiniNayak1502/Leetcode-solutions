class ATM {
    int[] notes={20,50,100,200,500};
    long[] noteCount;
    public ATM() {
        noteCount=new long[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0; i<5;i++){
            if(banknotesCount[i]>0)
                noteCount[i]+=banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int res[]=new int[5];
        long[] temp=new long[5];
        for(int i=0;i<5;i++){
            temp[i]=noteCount[i];
        }
        for(int i=4;i>=0;i--){
            long canUse= Math.min(temp[i],amount/notes[i]);
            res[i]=(int)canUse;
            amount-=canUse*notes[i];
            temp[i]-=canUse;
        }
        if(amount!=0)
            return new int[]{-1};

        noteCount=temp;    
        return res;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */

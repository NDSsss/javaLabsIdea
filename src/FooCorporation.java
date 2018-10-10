public class FooCorporation{
    public String getSallary(int baseSallary, int hours){
        if(baseSallary>0&&hours>0) {
            if (baseSallary < 300) {
                return "Слишком маленькая ЗП";
            }
            if (hours > 60) {
                return "Преработка";
            }
            int mainhours=40;
            int extraHouts=hours-mainhours;
            double sallary=0;
            sallary=baseSallary*mainhours;
            if(extraHouts>0){
                sallary+=baseSallary*1.5d*extraHouts;
            }
            return "Зарплата "+String.valueOf(sallary);
        }else{
            return "Неверные входные данные";
        }
    }
}

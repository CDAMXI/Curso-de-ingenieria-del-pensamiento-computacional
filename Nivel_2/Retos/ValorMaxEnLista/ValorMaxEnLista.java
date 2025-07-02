public class ValorMaxEnLista{
    public static void main(String[] args) {
        System.out.println(MaxValue(new int[]{1, 3, 4, 2, 5})); // 5
    }

    public static int MaxValue(int[] list){
        if(list == null || list.length < 1){
            throw new IllegalArgumentException("La lista no puede ser nula o vacía");
        }
        int max = list[0];
        for(int i = 1; i < list.length; i++){
            if(list[i] > max){
                max = list[i];
            }
        }
        return max;
    }
}

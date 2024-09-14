public class Palindrome {
    public static boolean isPalindrome(int nombre){
        //1️⃣ une copie du nombre original
        int nombreOriginale = nombre;
        //2️⃣ une variable qui va me servir à ajouter les chiffres en ordre inversé
        int nombreReverse = 0;
        //3️⃣ il faut utiliser la valeur absolue pour éviter une erreur en cas de nombre négatif
        nombre = Math.abs(nombre);
        /*4️⃣ avec cette boucle à chaque itération je vais:
            ⚪extraire le dernier chiffre de 'nombre' et le mettre dans une variable
            ⚪️ce dernier chiffre sera ajouter à la variable 'nombreReverse'
            ⚪️après cela je vais diviser 'nombre' par 10 comme ça à la prochaine itération
            ➡️on ne prend plus en compte ce chiffre et ainsi de suite...
         */
        while(nombre > 0){
            //prendre le dernier chiffre
            int dernierChiffre = nombre % 10;
            //multiplier la variable nombre par 10 pour faire passer le chiffre précédent à gauche et ensuite mettre
            // le dernier chiffre
            nombreReverse = nombreReverse * 10 + dernierChiffre;
            nombre = nombre / 10;
        }
        //verifier que 'nombreOriginale' est égal à 'nombreReverse'
        return nombreReverse == Math.abs(nombreOriginale);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}

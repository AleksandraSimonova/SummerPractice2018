import java.util.*

/*fun main(args: Array<String>) {
 /* print("Input your value: ")
 val input = readLine()
 print("Input your value1: ")
 val input1 = readLine()
 if(input != null && input1 != null)
     print(calcTaxes(input.toDouble(), input1.toDouble())) */

// Sqr
 /*print("a: ")
 val a = readLine()
 print("b: ")
 val b = readLine()
 if(a != null && b != null)
  print(Sqr(a.toDouble(), b.toDouble())) */

 // massive
/* val array = Array(10){i -> Random().nextInt()}

 for(temp in array) {
  println(temp)
 }*/

 /*var count = 0
 for (a in args)
  count += a.toInt()

 var g = count / args.size
 val text = "Sum: ${count}"
 val text1 = "Average: ${g}"
 println(text)
 print(text1) */

 var str = "Смешанные чувства теснятся в груди моей, когда я приступаю к описанию этой экспедиции, принесшей мне больше, нежели я мог надеяться. Отправляясь в путь с Земли, я назначил себе целью достижение невероятно далекой планеты в созвездии Краба, Зазьявы, слава о которой разносится по всей космической пустоте благодаря тому, что она подарила Вселенной одну из наиболее выдающихся ее личностей, Учителя Ох. Не так на самом деле зовут сего блестящего мыслителя, я же пользуюсь этим именем, ибо ни один земной язык не в состоянии передать его иным образом. Ребенку, рождающемуся на Зазьяве, вместе с необыкновенно длинным, по нашим представлениям, именем присваивают несметное множество титулов и отличий.\n" +
           "Когда в свое время Учитель Ох пришел в мир, его нарекли именем Гридипидагититоситипопокартуртегвауана-топочтоэтотам. Он получил титулы Златотканого Оплота Бытия, Доктора Совершенной Кротости, Светлой Вероятностной Всесторонности и т.д. и т.п. По мере того как он мужал и учился, каждый год его лишали одного титула и частички имени, а поскольку способности он выказывал необычайные, уже на тридцать третьем году жизни у него отобрали последнее отличие, спустя же еще два года у него вообще не осталось титулов, а имя его обозначалось одной только – да к тому же немой – буквой зазьявского алфавита: «придыхание блаженства», то есть особого рода подавленный вздох, который издают от избытка уважения и наслаждения.\n"
 var array = str.split(" ")
 var wrd = array.size
 var array1 = str.split(".")
 var snt = array1.size

 println(wrd);
 println(snt);


} */


/*fun sum(int1 : Int, int2: Int): Int =  int1 + int2

fun calcTaxes(value : Double = 1000.0, taxP: Double = 0.5) : Double {

 return value * taxP
}

fun Name(){

 print("Input your Surname: ")
 val surname = readLine()
 val text = "Surname: ${surname}"
 print("Input your Name: ")
 val name = readLine()
 val text1 = "Name: ${name}"
 if(text != null && text1 != null) {
  println(text)
  print(text1)
 }
}

fun Sqr(a: Double, b: Double ): Double = a * b */

data class Player(var name: String, var hpmax : Double = 100.0, var hp : Double = 100.0, var xp : Double = 0.0, var lvl : Int = 1, var nextLvlXp : Double = 10.0 ) {

 fun LvlUp(){
  lvl += 1
  xp = 0.0
  hp = hpmax

 }

 fun increaseXp(value : Int)
 {
  xp += value
  if (xp > nextLvlXp) LvlUp()
 }

 fun deathPenalty() {
  xp /= 2
  hp = 0.05 * hpmax
  println(xp)
 }
}

fun main(args: Array<String>) {

 var myClass = Player("John")
 print(myClass)


}
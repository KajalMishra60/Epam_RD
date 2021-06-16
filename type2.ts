enum language{
    Hindi,English,Sanskrit
}
class Student{
    Name: string;
    age: number;
    lang: language;
}
var s=new Student();
s.age=21;
s.lang=language.English;
s.Name="Kajal Mishra";
console.log(s.Name);
console.log(s.age);
console.log(s.lang);
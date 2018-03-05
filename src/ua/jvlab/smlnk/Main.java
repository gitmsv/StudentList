package ua.jvlab.smlnk;

import ua.jvlab.smlnk.objects.StudList;
import ua.jvlab.smlnk.objects.Student;
import ua.jvlab.smlnk.objects.UsrExp;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws UsrExp {

        /**ключевое слово final означает, что при попытке положить в перевменную std
         * новый элемент  new StudList() не получится */

        // final
        StudList std = new StudList();

        std.addStd(new Student("Serg", "Mlnk", new Date(81, 8, 22)));
        std.addStd(new Student("Максік", "Млнк", new Date(109, 0, 31)));
        std.addStd(new Student("Наталия", "Ивановна", new Date(56, 7, 31)));
        std.addStd(new Student("Vladimir","Владимирович",new Date(57,6,19)));
        //std.addStd(new Student("Ivan","Ivanov",new Date(88,8,04)));

        System.out.println("link / hashCode on var. 'std'    ==>     "+std + "\n");

        System.out.println("Output var. StdLastN of index[0] ==>     "+std.getStd(0).getSdtLastN().toString());
        System.out.println("Output var. StdName of index[1]  ==>     "+std.getStd(1).getSdtName().toString());
        System.out.println("Output var. StdName of index[2]  ==>     "+std.getStd(2).getStdBirth().toString()+"\n");

        System.out.println("find 'Наталия', index  = "+std.findStd("Наталия")); // 2
        System.out.println("find 'Serg', index  = "+std.findStd("Serg")+"\n"); // 0

        // System.out.println("find 'Серг', index  = ");
        //System.out.println("find 'Серг', index  = "+std.findStd("Серг")); // Exception in thread "main" java.lang.NullPointerException

        std.infoAll();
        System.out.println();

        System.out.println(std.findStdFaml("Mln")+"\n");

        System.out.println(std.findStdBirth(new Date(109,0,31))+"\n");

//        System.out.println(std.delStdNameAndFaml("Млнк"));
//        std.infoAll();
        System.out.println();

        /** UserExceptions */
//        try {
//            std.addStd(new Student("Pitt","Petrov",new Date(99,5,04)));
//        } catch (UsrExp e) {
//            e.toString();
//        }
//
//        std.infoAll();

    }
}

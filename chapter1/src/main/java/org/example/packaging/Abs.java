package org.example.packaging;

import java.sql.*;
import java.util.Date;
import java.util.concurrent.atomic.*;

public class Abs {
    AtomicInteger atomicInteger;

    //import qilyotganda yulduzcha (*) ni ishlatsak u faqat yulduzchadan oldingi yozilgan folder dagi obyektlarni qidiradi
    // uni ichidagi subfolder lardan qidirmaydi
    // masalan: AtomicInteger ni
    // import java.util.concurrent.atomic.*;  shunday qilsak topadi
    // lekin  import java.util.concurrent.* qilsak topmaydi chunki faqat concurrent degan papkani ichidan AtomicInteger ni qidiradi.
    // Wildcards:
    // Agar java.lang.* dagi biror Obyekt larni ishlatmoqchi bolsak uni import qilmasdan ishlatishimiz mumkin
    // agar class ni aniq qilib korsatsak wildcard dan ustinda turadi
    // masalan
    // import java.util.Date;
    // import java.sql.*;
    // bu yerda util Date ni koradi agar siz class da Date ni declare qilgan bolsez
    Date date;
}

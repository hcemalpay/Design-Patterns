Shape adında bir abstract sınıfımız bulunuyor ve bu sınıfı kalıtım alan Circle, Rectangle, Square adında 3 sınıfımız var.
Shape bilgilerini veritabanında tutuyoruz var sayalım ve bir veritabanı sorgusundan sonra
tekrar aynı işlem için başka bir kullanıcının sorgusu işlemlerimizi çok yavaşlatacaktır.
Bu durumda bizim bu işlemi ön belleğe almamız gerekmekte.
İşte ShapeCache sınıfını bu sebeple kullanıyoruz.
Hashtable içinde veritabanından dönen verileri tutuyoruz gibi varsayabiliriz.
Burada loadCache() metodu ile temsilen gösterilmiştir.
Bu işleminden ardından getShape metodunda sayesinde clone objeler yaratıp kullanabiliyoruz.
Burada Shape sınıfının bir interface olan Cloneable’ı implement ettiğini unutmayalım.
Bu sayede clone sınıfını Object sınıfından Override edip kullanabiliyoruz ve bu sınıftan clone oluşturabiliyoruz.
Bunu yapmazsak Java’da bu mümkün olmuyor.
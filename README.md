# EBebekPatikaStore

PatikaStore adında bir sanal mağazanın, ürün yönetim panelini simüle eden uygulama.

Bu uygulamayla sistemimizde bulunan notebook ve cep telefonlarını görebiliyor, listeden ürün silebiliyor, listeye yeni ürünler ekleyebiliyor
ve bu ürünlerin markalarını listeyebiliyoruz.

Brand sınıfında bu ürünlerin markalarını tanımladım. Bunun yanında bu markaları alfabetik olarak kullanıcıya sunan method yazdım.

Product abstract classıyla, bu ürünlerin ortak özellikleri ve getter-setter methodları tanımladım. Böylece kod tekrarının önüne geçtim ve
kodun okunurluğunu arttırmayı amaçladım.

Notebook sınıfında Product abstract classını extend ettim ve Notebook'a ait diğer özellikleri de tanımladım. Sistemde daha önceden olduğu
farz edilen ürünleri listeye ekledim. Bunun yanında notebook listesini yazdırma, listeye yeni ürün ekleme, listeden ürün silme ve notebook
işlemlerini bu sınıfta tanımladım.

Mobilephone sınıfında Product abstract classını extend ettim ve MobilePhone'a ait diğer özellikleri de tanımladım. Sistemde daha önceden 
olduğu farz edilen ürünleri listeye ekledim. Bunun yanında telefon listesini yazdırma, listeye yeni ürün ekleme, listeden ürün silme ve 
telefon işlemlerini bu sınıfta tanımladım.

PatikaStore sınıfında kullanıcının uygulamada karşılaştığı ekranı tasarladım. Ürün Yönetim Paneli ekranı ve işlemlerini bu sınıfta
kullanıcıya gösterdim.Seçilen işleme göre oluşturduğum objelerle ilgili sınıflara erişim sağladım ve bu sınıflara ait methodları kullandım.

Main sınıfındaysa PatikaStore sınıfından oluşturduğum objeyle programın başlama emrini verdim.

package com.roasloa.tarrot.Services

import com.roasloa.tarrot.Model.Fal
import com.roasloa.tarrot.Model.FalTexts
import com.roasloa.tarrot.Model.SecilecekKart
import kotlin.random.Random

object FalDataService {

    val secilecekKartlar = listOf<SecilecekKart>(SecilecekKart("tarotback",true,0),
        SecilecekKart("tarotback",true,1),SecilecekKart("tarotback",true,2),
        SecilecekKart("tarotback",true,3),SecilecekKart("tarotback",true,4),
        SecilecekKart("tarotback",true,5),SecilecekKart("tarotback",true,6),
        SecilecekKart("tarotback",true,7),SecilecekKart("tarotback",true,8),
    SecilecekKart("tarotback",true,9),SecilecekKart("tarotback",true,10),
    SecilecekKart("tarotback",true,11),SecilecekKart("tarotback",true,12),
    SecilecekKart("tarotback",true,13),SecilecekKart("tarotback",true,14),
    SecilecekKart("tarotback",true,15),SecilecekKart("tarotback",true,16),
        SecilecekKart("tarotback",true,17),SecilecekKart("tarotback",true,18),
        SecilecekKart("tarotback",true,19),SecilecekKart("tarotback",true,20),
        SecilecekKart("tarotback",true,21),SecilecekKart("tarotback",true,22),
        SecilecekKart("tarotback",true,23),SecilecekKart("tarotback",true,24),
        SecilecekKart("tarotback",true,25),SecilecekKart("tarotback",true,26),
        SecilecekKart("tarotback",true,27),SecilecekKart("tarotback",true,28),
        SecilecekKart("tarotback",true,29),SecilecekKart("tarotback",true,30),
        SecilecekKart("tarotback",true,31),SecilecekKart("tarotback",true,32),
        SecilecekKart("tarotback",true,33),SecilecekKart("tarotback",true,34),
        SecilecekKart("tarotback",true,35),SecilecekKart("tarotback",true,36),
        SecilecekKart("tarotback",true,37),SecilecekKart("tarotback",true,38),
        SecilecekKart("tarotback",true,39),SecilecekKart("tarotback",true,40),
        SecilecekKart("tarotback",true,41),SecilecekKart("tarotback",true,42),
        SecilecekKart("tarotback",true,43),SecilecekKart("tarotback",true,44),
        SecilecekKart("tarotback",true,45),SecilecekKart("tarotback",true,46),
        SecilecekKart("tarotback",true,47),SecilecekKart("tarotback",true,48),
        SecilecekKart("tarotback",true,49),SecilecekKart("tarotback",true,50),
        SecilecekKart("tarotback",true,51),SecilecekKart("tarotback",true,52),
        SecilecekKart("tarotback",true,53),SecilecekKart("tarotback",true,54),
        SecilecekKart("tarotback",true,55),SecilecekKart("tarotback",true,56),
        SecilecekKart("tarotback",true,57),SecilecekKart("tarotback",true,58),
        SecilecekKart("tarotback",true,59),SecilecekKart("tarotback",true,60),
        SecilecekKart("tarotback",true,61),SecilecekKart("tarotback",true,62),
        SecilecekKart("tarotback",true,63),SecilecekKart("tarotback",true,64),
        SecilecekKart("tarotback",true,65),SecilecekKart("tarotback",true,66),
        SecilecekKart("tarotback",true,67),SecilecekKart("tarotback",true,68),
        SecilecekKart("tarotback",true,69),SecilecekKart("tarotback",true,170),
        SecilecekKart("tarotback",true,71))


    val fallar = listOf<Fal>(Fal("Kendin için baktır", "X kart seç, falına bakalım."),
        Fal("Arkadaşın için baktır","Arkadaşın için fal baktır!"),
        Fal("Sevgilin için baktır", "Sevgilin için fal baktır!"))

    val falGiris = listOf<FalTexts>(
    FalTexts("Merhaba X, kafanda sürekli oradan oraya sürüklenen o güzel fikirlerinden/hayallerinden bir tanesini artık gerçekleştirmeye başlamak için en doğru zamanlardan birindesin. Nasıl bir fikir/hayal olduğunu anlaman için veya önüne çıkacak engelleri nasıl aşabileceğini öğrenmek için okumaya devam et."),
    FalTexts("Merhaba X, nerede olursan ol kafanı karıştıran 'oraya ait değilmiş' gibi hissedişlerinin şiddetinin azalacağını gönül rahatlığıyla söyleyebilirim. Ama bu elbette kendi kendine gerçekleşmeyecek, sana sadece seçtiğin kartların gösterdiği yolu anlatabilirim. İyi hissetmen gerektiğini sen de biliyorsun."),
    FalTexts("Merhaba X, kendi kendine bir çok şey başardığını hissettiğim geçmişin aynı zamanda daha önce hiç açmadığın saklı sandıklarla dolmuş. Onları açmak için bir mucize beklememen gerektiği her ne kadar insanlar tarafından sık sık hatırlatılsa da ve artık bunu duymak seni kırmaya başlasa da, bir de benden duymanın iyi geleceğini düşündüm. Gerçekten güvendiğin insanlara anlatabilirsin geçmişindeki acılarını. Seçtiğin kartların sana yol gösterdiği yolları uygulamayı dene hayatında."),
    FalTexts("Merhaba X, önümüzdeki günlerde çok büyük sorunlarla karşılaşmayacaksın gibi görünüyor. Ama yine de kartların uyarılarına dikkat etmekte fayda var."),
    FalTexts("Merhaba X, kaostan koşar adım uzaklaşman ve yavaş yavaş aydınlığa kavuşman enerjine de yansımış. Daha da olgunlaştığın bu dönemde, karşılaşabileceğin önemli sorunları baş edebilmen için aşağıda yazdıklarıma bir göz at istersen."),
    FalTexts("Merhaba X, finansal anlamda ufak bir rahatlama yaşayacağın önümüzdeki haftalarda sosyalleşmekten kaçınmaman gerektiğin görülüyor. Kartların sana anlatmak istediklerini hissetmelisin."),
    FalTexts("Merhaba X, içine attığın şeyleri bir volkan tarzı patlamadan günışığına çıkarmanın yollarını bulduğunu görmek güzel. Ne kadar zorlandığın, kartların verdiği enerjiden anlaşılıyor ama içini rahat tut, çünkü giderek daha az zorlanacaksın."),
    FalTexts("Merhaba X, arkadaş gruplarında gereken ilgiyi göremediğin bir hafta geçirmiş gibi görünüyorsun. İçini rahat tut, çünkü durum değişmek üzere. "),
    FalTexts("Merhaba X, sorunlarından sürekli kaçma durumunun değişmeye başladığını ve uzun süre uğraşlarının sonunda bir bakıma kendi hayatının iplerini almaya başladığın hissediliyor kartlarında."),
    FalTexts("Merhaba X, zincirlerinden ve seni kısıtlayan büyük bir yükten kurtulmak üzere olduğunu ve uzun süredir kozanda bekledikten sonra bir kelebek gibi kanatlanacağın şimdiden hissediliyor. Kartlarına kulak ver ki, kanatlarını kırmaya çalışanlardan uzak durabil."),
    FalTexts("Merhaba X, yeteneklerini doyasıya sergileyebileceğin inanılmaz bir ay bekliyor seni şimdiden. Önüne çıkacak tuzakları alt etmen için seçtiğin kartların neler anlattığını iyi dinle."),
    FalTexts("Merhaba X, kimseye anlatamadığın dertlerin için kendi kendine bir şeyler ürettiğini hissediyorum. İster bir kağıda aklından geçenleri yazıyor, ister müzikle uğraşıyor, ister bir şeyler çiziyor ol; artık bu yönünü insanlarla paylaşman gerektiğin hissediliyor. Kartlarının sana nasıl yol gösterdiğine kulak ver."),
    FalTexts("Merhaba X, tekdüzeleşmiş ve gitgide sıkıcılaşmaya başladığını düşündüğün ister ilişkin, ister kariyerin ister okul durumun olsun; giderek eğlenceli hâle gelmeye başlayacağını şimdiden hissedebiliyorum. Kartlarının sana söylemek istediklerine kulak ver."),
    FalTexts("Merhaba X, söylemen gereken ve söyleyemediğin o kadar şey birikmiş ki kartların seninle konuşmak için can atıyor. Öğrenmek için okumaya devam et."),
    FalTexts("Merhaba X, ne güzel enerjin var, adeta bütün umutsuzlukları sonlandıracak kadar güçlü. Enerjinin falına yansımaları nasılmış bakalım."),
    FalTexts("Merhaba X, şanssızlıklarla geride bıraktığın bir hafta yerini sana şans ve inanılmaz bir heyecan getirecek bir haftaya bırakıyor. Önemli adımlar atman için önümüzdeki 7 gün senin için çok önemli. Bakalım seçtiğin kartlar seni hangi konularda uyaracak."),
    FalTexts("Merhaba X, falının enerjisi gerçekten çok yüksek görünüyor. Adeta seçtiğin kartlar sana yol göstermek için çırpınıyor. Bakalım neler söylemek istiyorlar."),
    FalTexts("Merhaba X, sürekli koşuşturduğunu ve nefes bile alamayacak kadar meşgul olduğunu hissettiren kartların sana biraz duraklaman ve ufak bir dinlenme ritüeli düzenlemen konusunda adeta yalvarıyor. Kendine zaman ayırmanın tam vakti. Hadi bir de kartlarına bakalım."),
    FalTexts("Merhaba X, sosyal ihtiyaçlarının artmaya başladığını görüyorum kartlarına göz gezdirdiğimde. Şu sıralar biraz içine mi kapanmışsın sanki? Bir çiçek gibi açacağını umarak falına başlayalım bakalım, neler bekliyor seni."),
    FalTexts("Merhaba X, falına başlamadan söylemeliyim ki hiç açmaman gereken kapıları merakından açmış olsan da, arkasında bekleyen kötülükleri kolayca alt etmişsin gibi görünüyor. Hâlâ alt edemediklerin varsa da okumaya devam et, çünkü falın sana yol gösterici konumda."),
    FalTexts("Merhaba X, büyük dertlerinden kurtulmak için verdiğin uğraşlar kartlarına da yansımış. Merak etme, çünkü falın tam bu konuda sana yol gösterici olacak."),
    FalTexts("Merhaba X, en sevdiğin şarkıyı aç çünkü görünen o ki güzel bir fal seni bekliyor."),
    FalTexts("Merhaba X, seçtiğin kartlara göz gezdirecek olursam sıkıntılı bir dönemden geçtiğin fark ediliyor. Başlayalım mı, ne dersin?"),
    FalTexts("Merhaba X, umuyorum ki birazdan okuyacakların sana yol gösterici olacak. ")
    )

    val falGecmis = listOf<FalTexts>(
        FalTexts("Geçmişin için açmış olduğun kart Y sevgili X. Gizli bağlantılardan ve bir bakıma labirent gibi tahayyül ettiğim zihninde yaşadığın olaylar birbirleri ile iç içe geçmiş gibi görünüyor. Her geçen gün daha da aydınlattığın yaşadığın olayların gizli yüzleri, seni sen yapan değerleri anlamanda her geçen gün seni gerçekliğe bir adım daha yaklaştırıyor. Geçmişine iyimser ya da kötümser değil de, yavaş yavaş daha realist bakmaya başladığın hissediliyor."),
        FalTexts("Geçmişin için seçtiğin kart Y, sevgili X. Sıkıntılı bir yakın geçmişin henüz bittiğini gösterdiğini hissettiğim bu kart, aynı zamanda yaşadığın olaylardan diğer insanlardan farklı olarak daha çok etkilendiğini de söylüyor. Sıkıntılarının bitmesi beraberinde uzun süredir yapmak istediğin ama bir türlü başlayamadığı bir şey için attığın adımları da getirmiş."),
        FalTexts("Geçmişin için seçtiğin kart Y, sevgili X. Sakin, gösterişten uzak geçmişin aynı zamanda içinde fırtınaları ve hiç anlatmak istemediğin sırlarla dolu gibi görünüyor. Yakın geçmişinde tanışmış olduğun bir kadının, geçmişindeki fırtınaları dindirmek için adımlar atacağını ve sen farkında bile olmadan seni rahatlatmak üzere sırlarını paylaştıracağını görüyorum. Hızla arkadaşlığınızın ve yakınlığınızın artacağı bu kadın, sizi ayrılmaz bir ikiliye dönüştürecek gibi hissediyorum tatlım."),
        FalTexts("Geçmişin için seçtiğin kart Y, sevgili X. Uzun süredir kaçmaya çalıştığın geçmişini sanki bir kutuya koymuş, kilitlemiş ve bir rafa kaldırmışsın. Anahtarını nereye koyduğunu bile hatırlamadığın bu kutuyu açmak üzere olduğun hissediliyor tatlım. Yakın geçmişinin sana kattığı olgunluk, artık o kutunun içindeki olmusuzluklardan gözünü korkutmamaya başlamış. Kutuyu açtığında içinin ne kadar çok ferahlayacağını senden önce arkadaşların keşfedecek. Kutunun içeriği elbet sana özgün olduğu için içinde seni nelerin beklediğini göremiyorum ama şunu söylemeliyim ki, siyahlıklar ve beyazlıklar beklediğinin tam aksine çok dengeli görünüyor. Bu denge, senin iç çatışmalarını dindirecek türden. Gel bir de şimdine bakalım."),
        FalTexts("Geçmişin için seçmiş olduğun kart Y sevgili X. İkili ilişkilerinde- gerek hayat partnerin olan insanlar gerek çok yakın hissettiğin arkadaşlar- adımlar atan ve bir şeylerin olması ya da daha iyiye gitmesi için çabalayan taraf hep sen olmuşsun gibi görünüyor tatlım. Bunu şu sıralar gerçekleştiremediğini düşünsen de, ya da bunu yapmaya artık enerjin olmadığını hissetsen de bunu yapmaya devam edeceksin. Geçmişinde yaptığın hatalarına artık pişmanlıklarla veya geri dönülmez yollar gibi bakmaktansa daha sakin ve dengeli bakmaya başlayacağın hissediliyor. Dediğim gibi, adımları atmaya tekrar başlayacaksın ve artmış olan farkındalığın sayesinde artık bunu sadece senin için gerçekten önemli olan insanlara yapacaksın. İçini ferah tut tatlım, çünkü güzel günler seni bekliyor."),
        FalTexts("Geçmişin için seçmiş olduğun kart Y sevgili X. Uzun süredir hissetmediğini gördüğüm bazı güzel duygulara olan hasretinin gideceğin fark ediliyor. Yakın geçmişinde girmiş olduğun depresyonik dönemden kurtulmak için adımlar atmaya, ve bir kez daha ayağa emin adımlarla kalkacağını da söyleyen Y kartı, seni aynı zamanda suskunluklarından da kurtaracağından bahsediyor. Sessizliğinin altında yatan çığlıkları güzel bir melodiye dönüştürecek biri ile tanışmış olman bu olasılığı artırıyor. Cinsiyetini malesef göremediğim bu kişi çok yakın bir dostun olmaya da başlayabilir, içindeki mantraları altüst edecek ve senin için değişimleri tetikleyecek bir partner de. Bu kişi ile henüz tanışmamış olduğunu düşünüyorsan, yakında bu kişinin hayatına gireceğinden emin olabilirsin tatlım. Hadi gel biraz da şimdiki hayatına dönelim.")
    )

    val falSimdi = listOf<FalTexts>(
        FalTexts("PLACEHOLDER ŞİMDİKİ ZAMAN")
    )

    val falGelecek = listOf<FalTexts>(
        FalTexts("PLACEHOLDER GELECEK ZAMAN")
    )

    val falSonuc = listOf<FalTexts>(
        FalTexts("PLACEHOLDER SONUÇ")
    )


    fun falMerge(): String{


        return "${falGiris[Random.nextInt(0, falGiris.size)].text} \n" +
                " ${falGecmis[Random.nextInt(0, falGecmis.size)].text} \n" +
                " ${falSimdi[Random.nextInt(0, falSimdi.size)].text} \n" +
                " ${falGelecek[Random.nextInt(0, falGelecek.size)].text} \n" +
                " ${falSonuc[Random.nextInt(0, falSonuc.size)].text} \n"

    }



}
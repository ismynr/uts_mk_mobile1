package com.ismynr.submission_reviewhostingid.data;

import com.ismynr.submission_reviewhostingid.R;
import com.ismynr.submission_reviewhostingid.entity.Hosting;

import java.util.ArrayList;

public class HostingData {
    private static String[] hostingNames = {
            "IDWebhost",
            "Dewaweb",
            "Jagoan Hosting",
            "Qwords",
            "Rumah Web",
            "Niagahoster",
            "Masterweb",
            "Domainesia",
            "Hostinger",
            "Unlimited.id"
    };
    private static String[] hostingDeskripsi = {
            "IDwebhost merupakan jasa layanan domain gratis dan hosting murah di Indonesia. Selain itu jasa layanan pembuatan web hosting terbesar di Indonesia ini juga sudah dipercaya lebih dari 100 ribu pelanggan. Mereka memiliki beberapa paket Hosting murah seperti Personal, Charming, Cute, Awesome dan Fantastic. Setipa paket tentu saja memiliki keunggulan yang berbeda-beda dan tentu saja hal tersebit berdasarkan syarat dan ketentuan dan yang berlaku. Setiap orang tentunya menginginkan perpanjangan yang murah dalam setiap ekstensi websitenya. Dalam hal ini IDWebhost menyediakan harga yang murah untuk setiap perpanjangan ekstensi setiap tahunnya. Hal ini mereka lakukan karena semakin banyak peminat layanan web Hosting yang menginginkan perpanjangan murah namun tetap berkualitas. \n",
            "Dewaweb merupakan salah satu penyedia layanan Web Hosting terbaik di Indonesia yang berdiri pada tahun 2014. Dalam perjalanannya, Dewaweb telah menyediakan lebih dari 32.000 pelanggan karen layanan yang memuaskan. Website kini semakin dijadikan aset yang penting untuk bisnis online sehingga untuk memilihnya harus dilihat dari kualitas dan kemudahan dalam pemakaian.\n",
            "Penyedia layanan yang didirikan pada tahun 2007 ini sudah sudah melayani lebih dari 25.000 akun domain dan hosting yang sudah tersebar di seluruh Indonesia. Jagoan Hosting tak hanya fokus pada layanan penyedia web hosting saja tetapi mereka juga memiliki hardware terbaik di dunia. Untuk semakin melebarkan sayapnya agar dipakai di seluruh dunia, Jagoan Hosting juga menggunakan server Supermicro dan Intel Xeon yang memiliki kecepatan 2 kali lipat jika dibandingkan dengan layanan web hosting pada umumnya\n",
            "Ada banyak pilihan Web Hosting di Indonesia, salah satunya adalah Qwords. Qwords merupakan perusahaan Web Hosting Indonesia yang memberikan harga termurah dengan pelayanan terbaik. Tak hanya itu saja, perusahaan yang berdiri sejak tahun 2005 ini juga selalu memberikan harga diskon untuk domain yang akan Anda beli. Qwords memiliki beberapa kantor cabang antara lain di Surabaya, Bandung dan Yogyakarta. Sedangkan untuk kantor pusat berada di Jakarta.\n",
            "Rumahweb bisa dibilang penyedia layanan Web Hosting yang paling lama di Indonesia yang berdiri sejak 2002. Kini Rumahweb telah melayani lebih dari 14.000 domain dan memiliki lebih dari 30 server yang sudah tersebar di seluruh Indonesia.\n" +
                    "Setiap layanan Web Hosting tentunya memiliki keunggulan yang berbeda-beda. Begitu juga dengan Rumahweb. Mereka memiliki komitmen untuk bisa menjaga kepercayaan pelanggan agar tetap menggunakan layanannya. Prinsip seperti itulah yang diterapkan oleh Rumahweb sehingga sampai saat ini masih menjadi penyedia layanan Web Hosting yang menyediakan harga yang murah dan berkualitas",
            "NiagaHoster adalah Layanan web Hosting Indonesia yang cepat dan mudah serta dilengkapi dengan bantuan teknis terbaik di Indonesia yang dipercaya oleh ribuan developer dengan harga termurah di kelasnya.\n" +
                    "Niagahoster juga menyediakan web Hosting untuk website wordpress yang sudah dilengkapi dengan fitur paling aman sehingga Anda akan tak perlu khawatir saat menggunakan website di mana saja dan kapan saja. Mereka juga menjanjikan berbagai kemudahan untuk Anda yang memilih menggunakan layanannya.",
            "Dengan semakin berkembangnya era digital, kita tahu bahwa website sangatlah penting sebagai media promosi untuk bisnis Anda. Tak heran jika semakin banyak penyedia layanan Web Hosting yang berlomba-lomba menyediakan harga termurah dengan kualitas terbaik. seperti halnya dengan Masterweb.\n" +
                    "Masterweb adalah salah satu penyedia layanan hosting dan domain yang sudah dikenal banyak orang, khususnya yang telah lama bermain di dunia Web Hosting. Layanan ini sudah berdiri sejak 15 tahun dan semakin berkembang hingga sekarang.",
            "Penyedia layanan Web Hosting kini semakin diminanati. Salah satunya sepetti DomaiNesia yang sudah berdiri sejak 2009. Meski tergolong cukup lama dan memiliki banyak saingan, akan tetapi DomaiNesia memiliki keunggulan yang berbeda dari layanan Web Hosting lainnya. Tak heran jika sampai saat ini masih banyak orang yang memilih DomaiNesia untuk kebutuhan Webnya.\n" +
                    "Sejak awal berdiri sampai sekarang, DomaiNesia telah memiliki lebih dari 45.000 pelanggan yang tak hanya berasal dari Indonesia saja saja tetapi juga Mancanegara. Hal ini tentu saja membuat banyak orang bertanya-tanya, meski banyak saingan mengapa DomaiNesia masih saja menjadi pilihan Web Hosting terbaik meskipun banyak sekali saingannya.",
            "Hostinger merupakan salah satu Web Hosting Indonesia yang berkualitas dan peayanan yang ramah. Memilih Hostinger sangatlah tepat kerana akan membuat webiste Anda lebih profesional.\n" +
                    "Berdasarkan pengalaman kami, Hostinger sangat direkomendasikan untuk Anda yang ingin mewujudkan keberhasilan dalam berbisnis online dengan web hosting tercepat dan aman. Hostinger juga menawarkan harga dengan diskon hingga 90% per bulan. Tentu ini menjadi poin penting bagi seseorang yang akan memutuskan untuk membeli web hosting.",
            "Sekarang ini di Indonesia sudah banyak layanan penyedia jasa web hosting. Salah satu yang paling poluler adalah Unlimited.id.  Layanan jasa web hosting yang beralamatkan di Kebrokan, Pandean, Umbuharjo, Yogyakarta ini menghadirkan berbagai pelayanan terbaik bagi pemilik website yang ingin memaksimalkan websitenya.\n" +
                    "Semua pelanggan tentunya ingin memiliki website dengan keunggulan yang berkualitas serta memiliki akses yang lebih optimal. Untuk masalah tersebut Anda tak perlu khawatir karena Unlimited.id hadir dengan layanan yang akan membantu Anda dalam menghadirkan tingkat kepuasan yang tinggi."
    };
    private static String[] hostingKelebihan = {
            "+ Garansi Uptime 99,9%, Keluhan ditanggapi dengan cepat,\n" +
                    "+ Waktu penanganan keluhan yang cepat,\n" +
                    "+ Akses Web 40 kali lebih cepat,\n" +
                    "+ Memiliki Cadangan Cloud Backup,\n" +
                    "+ Server Super Cepat,\n" +
                    "+ Garansi 30 Hari Uang kembali,\n" +
                    "Gratis Domain dan SSL\n",
            "+ Akses yang cepat, \n" +
                    "+ Dilengkapi dengan LiteSpeed Technologies dan Super-Fast SSD, \n" +
                    "+ Gratis Domain Selamanya, \n" +
                    "+ Penanganan masalah yang akurat dan cepat, \n" +
                    "+ Memiliki layanan RankingCoach, \n" +
                    "+ Traffic yang sudah Unlimited, \n" +
                    "+ Sertifikat SSL (HTTPS)\n",
            "+ Banyak pilihan paket Hosting yang Flexible, \n" +
                    "+ Didukung dengan Software Enterprise terbaik, \n" +
                    "+ Mengandalkan teknologi yang ramah lingkungan, \n" +
                    "+ Gratis migrasi hosting dan domain, \n" +
                    "+ Gratis Back up Harian\n",
            "+ Harganya ekonomis dan cocok untuk pemula\n" +
                    "+ Pelayanannya yang ramah\n" +
                    "+ Layanan 24 jam\n" +
                    "+ Memiliki Speed Hosting yang lebih cepat\n" +
                    "+ Jaminan keamanan\n" +
                    "+ Uptime 99,99%\n" +
                    "+ Dilengkapi dengan panduan yang lengkap untuk penggunanya\n" +
                    "+ Gratis migrasi Hosting",
            "+ Layanan 24 Jam setiap hari\n" +
                    "+ Customer Service yang ramah\n" +
                    "+ Gratis Domain dan Web Builder\n" +
                    "+ Gratis bagi Anda yang akan migrasi Hosting\n" +
                    "+ Dilengkapi dengan Fitur Weekly Backup",
            "+ Layanan Customer Service yang ramah\n" +
                    "+ Harga hosting termurah di kelasnya\n" +
                    "+ Gratis Domain dan SSL selamanya\n" +
                    "+ Layanan 24 jam 7 hari nonstop\n" +
                    "+ Dilengkapi dengan sistem perlindungan yang mumpuni\n" +
                    "+ Tutorial yang lengkap",
            "+ Web Hosting terbaik sejak 2004 hingga sekarang\n" +
                    "+ Domain murah mulai dari 80 ribuan\n" +
                    "+ Hosting mulai 9 Ribuan\n" +
                    "+ Dilengkapi dengan Panduan untuk memudahkan pelanggan\n" +
                    "+ Memiliki fitur Daily Backup untuk semua paket",
            "+ Respon Customer Service-nya yang cepat\n" +
                    "+ Uptime di atas rata-rata yaitu 99,96%\n" +
                    "+ Hosting dengan paket murah dengan pilihan sesuai kebutuhan\n" +
                    "+ Aktivasi yang cepat\n" +
                    "+ Gratis Migrasi Hosting\n" +
                    "+ Gratis Back up harian",
            "+ Layanan 24 jam setiap hari\n" +
                    "+ Respon yang cepat di malam hari\n" +
                    "+ Hosting paling murah di Indonesia\n" +
                    "+ Unlimited Web Hosting yang berkualitas\n" +
                    "+ Pilihan Hosting terbaik dan murah untuk WordPress\n" +
                    "+ Dilengkapi dengan Web Builder\n" +
                    "+ Garansi 30 Hari tanpa syarat",
            "+ Layanan 24 Jam seharian\n" +
                    "+ Pelayanan yang tepat sasaran\n" +
                    "+ Gratis migrasi website\n" +
                    "+ Dilengkapi dengan fitur yang cocok untuk online shop\n" +
                    "+ Memiliki garansi Uptime\n" +
                    "+ Dilengkapi dengan teknologi terkini",
            "",
            "",
            ""
    };
    private static String[] hostingKekurangan = {
            "- Paket Personal tidak gratis domain (UPDATE: Sudah tidak ada paket personal saat ini), \n" +
                    "- Harga belum termasuk PPN",
            "- Respon Whatsapp tidak direspon, \n" +
                    "- Chat Facebook yang tidak ada respon",
            "- Respon yang lama, Tidak ada layanan WA, \n" +
                    "- Uptime masih di bawah standard, \n" +
                    "- Harga hosting murah hanya berlaku untuk pembelian 3 tahun",
            "- Respon WA yang lama\n" +
                    "- Respon chat facebook yang cukup lama\n" +
                    "- Harus mengirim email 4 kali baru ada perbaikan",
            "- Belum ada garansi untuk pembelian Hosting\n" +
                    "- Respon Email yang agak lama\n" +
                    "- Pada salah satu paket masih memberikan Sumber Daya yang masih terbatas\n" +
                    "- Kecepatan loading yang lambat",

            "- Tidak menyediakan layanan komplain melalui WA\n" +
                    "- Respon cepat namun solusi tidak tepat\n" +
                    "- Layanan Live Chat yang antri lama",
            "- Layanan 24 jam yang tidak melulu dilayani\n" +
                    "- Penanganan yang tidak sesuai dengan permasalahan\n" +
                    "- Belum ada garansi pembelian Hosting\n" +
                    "- Uptime yang masih buruk",
            "- Garansi yang tidak sampai 30 hari\n" +
                    "- Respon WA yang kurang maksimal\n" +
                    "- Pada paket “Lite” masih memiliki batasan",
            "- Tidak ada chat via WA\n" +
                    "- Harus order selama 4 tahun untuk mendapatkan harga termurah\n" +
                    "- Tidak Free SSL pada paket Single dan Premium\n" +
                    "- Harus Log in terlebih dahulu jika ingin melakukan Live chat\n" +
                    "- Free Domain dan SSL hanya untuk paket Bisnis",
            "- Layanan LiveChat yang agak lama\n" +
                    "- Domain hanya bisa diorderkan oleh Customer Service\n" +
                    "- Respon yang lama untuk Facebook Chat dan Whatsapp"
    };
    private static int[] hostingImage = {
            R.drawable.idwebhost,
            R.drawable.dewaweb,
            R.drawable.jagoanhosting,
            R.drawable.qwords,
            R.drawable.rumahweb,
            R.drawable.niagahoster,
            R.drawable.masterweb,
            R.drawable.domainesia,
            R.drawable.hostinger,
            R.drawable.unlimitedid
    };
     public static ArrayList<Hosting> getListData(){
        ArrayList<Hosting> list = new ArrayList<>();

        for(int i=0;i<hostingNames.length;i++){
            Hosting host = new Hosting();
            host.setNama(hostingNames[i]);
            host.setDeskripsi(hostingDeskripsi[i]);
            host.setKelebihan(hostingKelebihan[i]);
            host.setKekurangan(hostingKekurangan[i]);
            host.setPhoto(hostingImage[i]);
            list.add(host);
        }
        return list;
    }
}

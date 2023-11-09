<div dir='rtl' align='center'>
<h1> گزارش پروژه دوم </h1>
<!-- محمد نامدار    -    حمیدرضا دهباشی -->
</div>

## مقدمه
در این آزمایش قصد داریم با اصول شئ‌گرایی
(SOLID)
آشنایی پیدا کنیم و آن ها را در قالب یک پروژه عملی ساده به کار بگیریم.

## اجرای آزمایش

### گام اول: افزودن یک روش پرداخت دیگر
در این گام قصد داریم یک روش پرداخت تلفنی به پروژه اصلی، که به طور کامل از اصول شئ‌گرایی پیروی نمی‌کند اضافه کنیم.

خلاصه‌ای از تغییرات لازم برای پیاده‌سازی این قابلیت در جدول زیر آمده است:

<div align='center'>
<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>Order Service</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phone Order Payment</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>Order Service</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفتی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phone Order Payment</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>

</tbody>
</table>
</div>

مجموع تعداد تغییرات: <b> .............. </b>

# Debooooooooooooooooooo

### گام دوم : تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID

در این گام برنامه از جهت رعایت اصول SOLID
بررسی می‌کنیم و در مواردی که اصلی نقض شده است، راه حل‌هایی را برای اصلاح ارائه می‌دهیم.

<div align='center'>
<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility Principle</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>این اصل در کلاس‌های Food و Order
 و همچنین در کلاس های OrderService
رعایت شده است.</p>
</td>
</tr>

<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>در Main اصل SRP نقض شده است چرا که
همه فاز‌های سفارش در تابع main پیاده شده است.</p>
</td>
</tr>



<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
<del>
 در کلاس های Food و Order
رعایت شده است. از آنجا که این کلاس ها وابستگی به سایر کلاس ها ندارند برای توسعه آزاد هستند. 
</td>
</tr>

<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
این اصل در OrderService و متعاقبا کلاس‌های ارث برنده از آن رعایت نشده است، 
چرا که به عنوان مثال برای اضافه کردن قابلیت خرید تلفنی باید کلاس های OnlineOrderService و OnSiteOrderService نیز تغییر بدهیم.
</p>
</td>
</tr>



<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
اصل LSP
در ارتباط رابط OrderService و کلاس های
OnlineOrderService و OnSiteOrderService
به درستی رعایت شده است.
</p>
</td>
</tr>

<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
 موردی از نفض و عدم رعایت این اصل در پروژه وجود ندارد.
</p>
</td>
</tr>



<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>موردی از رعایت اصل ISP 
در پروژه وجود ندارد.</p>
</td>
</tr>

<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
در پیاده‌سازی فعلی، این اصل در OrderService 
نقض شده است چرا که ما مجبور هستیم در کلاس‌های ارث برنده از آن برخی توابع رابط را خالی بگذاریم.
</p>
</td>
</tr>



<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
این اصل در رابط OrderService و کلاس‌های مربوطه است به درستی رعایت شده است.

<del> main
نیز از این اصل پیروی می‌کند.</del>
</p>
</td>
</tr>

<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>موردی از نقض اصل DIP در پروژه وجود ندارد.</p>
</td>
</tr>
</tbody>
</table>
</div>

#### راه حل‌های اصلاحی پیشنهادی

<div align='center'>
<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>

<tr>
<td width="168">
<p>SRP</p>
</td>
<td width="275">
<p>
همه فاز‌های مختلف سفارش دادن تا خرید در تابع main پیاده شده است.

<del> شک دارم
</p>
</td>
<td width="284">
<p>
برای حل این مسئله توابع مناسبی را در کلاس Main
می‌نویسیم و فاز‌های مختلف سفارش را در آن توابع پیاده می‌کنیم و در خود تابع main تنها به فراخوانی آن‌ها می‌پردازیم.
</p>
</td>
</tr>

<tr>
<td width="168">
<p>OCP</p>
</td>
<td width="275">
<p>
برای اضافه کردن قابلیت جدید، مثلا خرید و ثبت سفارش تلفنی، باید کلاس های OnlineOrderService و OnSiteOrderService نیز تغییر بدهیم.
</p>
</td>
<td width="284">
<p>توابع مربوط به یک کلاس خاص را که عمومیت ندارند، در رابط OrderService تعریف نمی‌کنیم.</p>
</td>
</tr>

<tr>
<td width="168">
<p>ISP</p>
</td>
<td width="275">
<p>
در کلاس‌های ارث برنده از OrderService
یعنی کلاس  OnSiteOrderService
، توابع onlineOrderRegister و onlineOrderPayment
و در کلاس OnlineOrderService
توابع onSiteOrderRegister و onSiteOrderPayment
باید خالی بمانند. 
</p>
</td>
<td width="284">
<p>
در رابط OrderService
 توابع کلی ثبت سفارش و پرداخت سفارش را تعریف می‌کنیم و در کلاس‌های ارث برنده از آن، توابع مربوط به نوع آن را پیاده‌سازی می‌کنیم.
</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>
</div>

### گام ۳: اصلاح موارد نقض

با توجه به پیشنهادات ارائه شده در بخش قبل، اصلاحاتی را در پروژه اعمال کردیم که در commit
زیر قابل مشاهده است:

[commit hash or message](www.link_to_commit.com)

### گام ۴: بررسی مجدد تغییرات مورد نیاز

<b> Deboooooooooo </b>

### گام ۵: جمع بندی


با توجه مراحل قبل می‌بینیم که توسعه پروژه در حالی که از اصول شئ‌گرایی پیروی نمی‌کند، به تغییرات بیشتر، پیچیده تر و معمولا گسترده تری نیاز دارد نسبت به وقتی که پروژه این اصول را رعایت می‌کند؛ همچنین احتمال ایجاد باگ در حالت اول، به دلیل تغییرات زیاد تر و پیچیده تر، به مراتب بیشتر است. <br>
در نتیجه نگهداری و توسعه پروژه‌هایی که از اصول شئ‌گرایی پیروی می‌کنند، به مراتب ساده‌تر و کم هزینه‌تر خواهد بود.
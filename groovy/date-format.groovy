// Convert date from yyyy-MM-dd to dd/MM/yyyy
import java.text.SimpleDateFormat

String inputDate = '2025-12-17'
SimpleDateFormat inputFormat = new SimpleDateFormat('yyyy-MM-dd')
SimpleDateFormat outputFormat = new SimpleDateFormat('dd/MM/yyyy')
String formattedDate = outputFormat.format(inputFormat.parse(inputDate))
println(formattedDate) // Output: 17/12/2025

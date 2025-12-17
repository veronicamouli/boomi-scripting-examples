// Convert date from yyyy-MM-dd to dd/MM/yyyy
let inputDate = '2025-12-17';
let [year, month, day] = inputDate.split('-');
let formattedDate = `${day}/${month}/${year}`;
console.log(formattedDate); // Output: 17/12/2025

# Boomi Scripting Examples

## 📌 Purpose

This repository demonstrates **custom Groovy and JavaScript scripts** commonly used in Dell Boomi processes for data transformation, validation, and automation. It is designed to showcase my ability to implement **custom logic within Boomi integrations**.

> ⚠️ Note: These scripts are standalone examples to illustrate the logic and can be easily integrated into Boomi process components like **Data Process Shapes** or **Business Rules**.

---

## 🗂️ Repository Structure

```
boomi-scripting-examples/
├── groovy/          # Groovy scripts
├── javascript/      # JavaScript scripts
└── README.md        # This overview
```

---

## 🧩 Groovy Scripts Examples

### 1️⃣ `string-manipulation.groovy`

```groovy
// Trim, uppercase, and concatenate strings
String firstName = ' John '
String lastName = 'Doe '
String fullName = (firstName.trim() + ' ' + lastName.trim()).toUpperCase()
println(fullName) // Output: JOHN DOE
```

### 2️⃣ `date-format.groovy`

```groovy
// Convert date from yyyy-MM-dd to dd/MM/yyyy
import java.text.SimpleDateFormat

String inputDate = '2025-12-17'
SimpleDateFormat inputFormat = new SimpleDateFormat('yyyy-MM-dd')
SimpleDateFormat outputFormat = new SimpleDateFormat('dd/MM/yyyy')
String formattedDate = outputFormat.format(inputFormat.parse(inputDate))
println(formattedDate) // Output: 17/12/2025
```

### 3️⃣ `validation.groovy`

```groovy
// Validate required fields and numeric ranges
Map<String,Object> data = [name: 'John', age: 25]

if(!data.name) throw new Exception('Name is required')
if(data.age < 0 || data.age > 120) throw new Exception('Age out of range')
println('Validation passed')
```

---

## 🧩 JavaScript Scripts Examples

### 1️⃣ `string-manipulation.js`

```javascript
// Trim, uppercase, and concatenate strings
let firstName = ' John ';
let lastName = 'Doe ';
let fullName = (firstName.trim() + ' ' + lastName.trim()).toUpperCase();
console.log(fullName); // Output: JOHN DOE
```

### 2️⃣ `date-format.js`

```javascript
// Convert date from yyyy-MM-dd to dd/MM/yyyy
let inputDate = '2025-12-17';
let [year, month, day] = inputDate.split('-');
let formattedDate = `${day}/${month}/${year}`;
console.log(formattedDate); // Output: 17/12/2025
```

### 3️⃣ `validation.js`

```javascript
// Validate required fields and numeric ranges
let data = { name: 'John', age: 25 };

if(!data.name) throw new Error('Name is required');
if(data.age < 0 || data.age > 120) throw new Error('Age out of range');
console.log('Validation passed');
```

---

## 📝 How to Use This Repo

* Review **Groovy and JS scripts** to understand common Boomi custom logic
* Integrate these snippets into **Data Process Shapes** or **Business Rules** in your own Boomi processes
* Use this as a reference for **interview discussions** or **real-world projects**

---

## 📬 Connect with Me

* **GitHub Profile:** [https://github.com/veronicamouli](https://github.com/veronicamouli)
* **LinkedIn:** [https://www.linkedin.com/in/veronica-chandramouli/]
* **Email:** [veronicachandramouli@gmail.com](mailto:veronicachandramouli@gmail.com)

---

⭐ This repository is part of my **enterprise Boomi integration portfolio**, demonstrating **custom scripting and automation capabilities**.

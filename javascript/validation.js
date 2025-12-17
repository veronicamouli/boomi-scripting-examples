// Validate required fields and numeric ranges
let data = { name: 'John', age: 25 };

if(!data.name) throw new Error('Name is required');
if(data.age < 0 || data.age > 120) throw new Error('Age out of range');
console.log('Validation passed');

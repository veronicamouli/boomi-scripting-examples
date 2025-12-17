// Validate required fields and numeric ranges
Map<String,Object> data = [name: 'John', age: 25]

if(!data.name) throw new Exception('Name is required')
if(data.age < 0 || data.age > 120) throw new Exception('Age out of range')
println('Validation passed')

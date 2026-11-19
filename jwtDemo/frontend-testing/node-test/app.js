export function sayHello(name) {
  if (!name) {
    return 'Hello, Guest!';
  }
  return `Hello, ${name}!`;
}

export function greetInHindi(name) {
  if (!name) {
    return 'नमस्ते, अतिथि!';
  }
  return `नमस्ते, ${name}!`;
}

// export function add(a, b) {
//   return a + b;
// }

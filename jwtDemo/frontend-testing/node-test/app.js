export function sayHello(name) {
  if (!name) {
    return 'Hello, Guest!';
  }
  return `Hello, ${name}!`;
}

export function add(a, b) {
  return a + b;
}

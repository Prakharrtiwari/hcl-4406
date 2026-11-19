import test from 'node:test';
import assert from 'node:assert';
import { sayHello, add } from '../app.js';

test('sayHello returns greeting with provided name', () => {
  const result = sayHello('Rahul');
  assert.strictEqual(result, 'Hello, Rahul!');
});

test('sayHello returns default greeting when name is not provided', () => {
  const result = sayHello();
  assert.strictEqual(result, 'Hello, Guest!');
});

test('add adds two numbers properly', () => {
  const result = add(3, 7);
  assert.strictEqual(result, 10);
});

require('jest');
const input = 5;

const checkInput = new Promise((resolve, reject) => {
    setTimeout(() => {
        if (input < 10) {
            resolve('Less than ten');
        } else {
            reject('More than ten');
        }
    }, 3000);
});

test('the input is less than ten', () => {
  expect.assertions(1);
  return checkInput.then((data) => {
    expect(data).toBe('Less than ten');
  });
});

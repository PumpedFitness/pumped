import js from '@eslint/js';
import tseslint from 'typescript-eslint';

export default [
  js.configs.recommended,
  ...tseslint.configs.recommended,
  {
    rules: {
      '@typescript-eslint/no-unused-vars': ['warn', {argsIgnorePattern: '^_'}],
      '@typescript-eslint/no-explicit-any': 'off',
      '@typescript-eslint/no-require-imports': 'off',
    },
  },
  {
    ignores: [
      'src/data/api/generated.ts',
      'src/data/local/schema.generated.ts',
      'src/data/local/schema.enums.generated.ts',
      'scripts/',
      'design_handoff_pumped*/',
      'node_modules/',
      'android/',
      'ios/',
      '*.config.js',
      '.prettierrc.js',
    ],
  },
];

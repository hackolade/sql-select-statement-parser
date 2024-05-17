const globals = require('globals');
const eslintConfigPrettier = require('eslint-config-prettier');

const config = {
	languageOptions: {
		ecmaVersion: 2022,
		sourceType: 'commonjs',
		globals: {
			...globals.node,
			...globals.mocha,
		},
	},
	ignores: ['.git/*', '.vscode/*', '.idea/*', 'node_modules/*', 'grammars/*', 'parser/*'],
	rules: {
		'no-cond-assign': 'error',
		'no-const-assign': 'error',
		'no-dupe-args': 'error',
		'no-dupe-keys': 'error',
		'no-duplicate-case': 'error',
		'no-unreachable': 'error',
		'eqeqeq': 'error',
		'no-var': 'error',
		'no-undef': 'error',
		'no-bitwise': 'warn',
		'no-dupe-else-if': 'warn',
		'no-duplicate-imports': 'warn',
		'no-import-assign': 'warn',
		'no-empty': 'warn',
		'no-extra-semi': 'error',
		'no-global-assign': 'warn',
		'no-redeclare': 'warn',
		'no-debugger': 'error',
		'no-console': 'error',
	},
};

module.exports = [config, eslintConfigPrettier];

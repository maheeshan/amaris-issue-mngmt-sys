export default async function getSampleString() {
	return fetch("http://ai-issue-mngmt-backend:8080/sample/string", {
		method: "GET",
		headers: {
			"Content-Type": "application/json"
		},
		next: {
			revalidate: 6
		}
	}).then(response => response.json())
	.catch(errorMsg => ({
		data: null,
		error: {
			message: errorMsg
		}
	}));
}
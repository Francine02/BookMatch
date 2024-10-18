export const metadata = {
  title: 'BookMatch',
  description: 'Book recommendation - BookMatch',
}

import '../style/globals.css'

export default function RootLayout({
  children,
}: {
  children: React.ReactNode
}) {
  return (
    <html lang="pt-br">
      <head>
        <link rel="icon" href="https://img.icons8.com/?size=100&id=K64BmSGjcwqt&format=png&color=000000" />
      </head>
      <body>{children}</body>
    </html>
  )
}
